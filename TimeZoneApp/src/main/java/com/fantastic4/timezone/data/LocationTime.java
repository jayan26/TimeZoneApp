package com.fantastic4.timezone.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
 * POJO to manage all zones
 * with Local Date Time format
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationTime {

    private LocalDateTime rajapalayam;
    private LocalDateTime dubai;
    private LocalDateTime london;
    private LocalDateTime sanAntonio;

}
