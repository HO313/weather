package zerobase.weather.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Diary;
import zerobase.weather.domain.Memo;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {

}
