package org.roon.dtos.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //not necessary but used.
public interface PostRepository extends JpaRepository<Post,Integer> {
}
