package com.steam_analyser.analytics.application.chrons;

import in.dragonbra.javasteam.steam.steamclient.configuration.SteamConfiguration;

public interface ISteamChron {
  
  void start(final SteamConfiguration theSteamConfiguration);
}