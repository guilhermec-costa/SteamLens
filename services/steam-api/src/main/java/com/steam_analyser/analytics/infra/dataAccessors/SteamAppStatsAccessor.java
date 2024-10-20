package com.steam_analyser.analytics.infra.dataAccessors;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.steam_analyser.analytics.models.SteamAppStatsModel;

public interface SteamAppStatsAccessor extends JpaRepository<SteamAppStatsModel, Long> {

  Optional<SteamAppStatsModel> findBySteamAppId(Long steamAppId);
}
