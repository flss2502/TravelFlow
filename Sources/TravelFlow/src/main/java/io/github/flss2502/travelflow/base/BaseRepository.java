package io.github.flss2502.travelflow.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BaseRepository<T, K> extends JpaRepository<T, K>, JpaSpecificationExecutor<T> {
}