/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ServiceGrade {
	@EmbeddedId
	protected ServiceGradePK serviceGradePK;
	
    @JoinColumn(name = "service_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ClimateService service;
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;
    
    private int grade;

    public ServiceGrade(){
    	
    }
    
	public ServiceGrade(ClimateService service, User user, int grade) {
		super();
		this.serviceGradePK = new ServiceGradePK(user.getId(), service.getId());
		this.service = service;
		this.user = user;
		this.grade = grade;
	}

	public ServiceGradePK getServiceGradePK() {
		return serviceGradePK;
	}

	public void setServiceGradePK(ServiceGradePK serviceGradePK) {
		this.serviceGradePK = serviceGradePK;
	}

	public ClimateService getService() {
		return service;
	}

	public void setService(ClimateService service) {
		this.service = service;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
    
}


