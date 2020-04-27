package com.fantastic4.timezone.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

/*
 * POJO to manage all zones
 * with Zoned Local Date Time format
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZonedLocationTime {

    private ZonedDateTime rajapalayam;
    private ZonedDateTime dubai;
    private ZonedDateTime london;
    private ZonedDateTime sanAntonio;

}
