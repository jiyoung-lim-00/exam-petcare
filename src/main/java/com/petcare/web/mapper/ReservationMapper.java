package com.petcare.web.mapper;

import com.petcare.web.domain.Reservation;

import java.util.List;

public interface ReservationMapper {

    List<Reservation> findAllByUsername(Long uid);
}
