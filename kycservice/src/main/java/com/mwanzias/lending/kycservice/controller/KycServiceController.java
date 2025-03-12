package com.mwanzias.lending.kycservice.controller;

import com.mwanzias.lending.kycservice.entity.KycData;
import com.mwanzias.lending.kycservice.service.KycDataService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class KycServiceController {

    @Autowired
    private KycDataService kycDataService;

    @PostMapping("/kycdata")
    public ResponseEntity<?> SaveCustomerData(@Valid @RequestBody KycData kycData) {
            // call service layer to pass the data
        KycData savedData = kycDataService.SaveCustomerData(kycData);
        
        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }


    @GetMapping("/kycdata")
    public List<KycData> getAllCustomerData() {
        return kycDataService.fetchAllCustomerData();
    }

    @GetMapping("/kycdata/phonenumber/{phonenumber}")
    public  KycData findAllByPhoneNumber(@PathVariable("phonenumber") String customerPhone) {
        return kycDataService.findCustomerByPhoneNumber(customerPhone);
    }

    @GetMapping("/kycdata/nationalid/{nationalid}")
    public  KycData findAllBynationalID(@PathVariable("nationalid") String nationalid) {
        return kycDataService.findCustomerByNationalId(nationalid);
    }

    @GetMapping("/kycdata/emailaddress/{emailaddress}")
    public  KycData findAllByEmailAddress(@PathVariable("emailaddress") String emailaddress) {
        return kycDataService.findCustomerByEmailAddress(emailaddress);
    }

    @PostMapping("/kycdata/update/{id}")
    public ResponseEntity<?> UpdateCustomerData(@Valid @RequestBody KycData kycData) {
        Optional<KycData> updatedRecord = kycDataService.updateLoanLimit(
                kycData.getCustomerPhone(),
                kycData.getCustomerEmail(),
                kycData.getLoanLimit()
        );
                return  updatedRecord.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
