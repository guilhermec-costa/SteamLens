package com.steam_analyser.analytics.api.presentation.SteamCharts;

import java.util.List;

import lombok.Data;

@Data
public class SteamResponseDTO {
  private Response response;

  @Data
  public static class Response {
    private long rollup_date;
    private List<Rank> ranks;
  }

  @Data
  public static class Rank {
    private int rank;
    private int appid;

    private int last_week_rank;
    private int peak_in_game;
  }
}