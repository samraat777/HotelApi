package com.sam.learningspring.web;

import com.sam.learningspring.business.service.ReservationService;
import com.sam.learningspring.data.entity.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestWebController {
    private final ReservationService reservationService;


    public GuestWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getGuests(Model model)
    {
        List<Guest> guests =this.reservationService.getHotelGuest();
        model.addAttribute("guests",guests);
        return "guests";
    }
}
