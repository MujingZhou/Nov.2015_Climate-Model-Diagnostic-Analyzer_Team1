package models;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface TagRepository extends CrudRepository<Tag, Long> {
	List<Tag> findByCommentId(long commentId);
}
