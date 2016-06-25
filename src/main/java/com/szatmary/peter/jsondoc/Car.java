package com.szatmary.peter.jsondoc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

/**
 * Created by nue on 25.6.2016.
 */

@ApiObject(name="Car", description = "Car object represents cars.")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Car {

    @ApiObjectField(description = "Just simple car name")
    private String name;

    @ApiObjectField(description = "Car owner")
    private Owner owner;

}
