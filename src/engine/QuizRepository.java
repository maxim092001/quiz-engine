package engine;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Grankin Maxim (maximgran@gmail.com) at 10:56 08.05.2020
 */

@Repository
public interface QuizRepository extends PagingAndSortingRepository<Quiz, Integer> {
}
