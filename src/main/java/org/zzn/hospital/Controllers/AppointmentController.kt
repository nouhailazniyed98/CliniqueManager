package org.zzn.hospital.Controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.zzn.hospital.Models.Appointment
import org.zzn.hospital.Services.AppointmentService


@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private val service: AppointmentService? = null

    @GetMapping
    fun getAll(): MutableList<Appointment?>? {
        return service!!.getAll()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long?): Appointment? {
        return service!!.getById(id)
    }

    @PostMapping
    fun create(@RequestBody appointment: Appointment?): Appointment? {
        return service!!.save(appointment)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long?) {
        service!!.delete(id)
    }
}