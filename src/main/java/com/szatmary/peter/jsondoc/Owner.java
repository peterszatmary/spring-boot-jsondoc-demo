package com.szatmary.peter.jsondoc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

/**
 * Created by nue on 25.6.2016.
 */
@AllArgsConstructor
@NoArgsConstructor
@ApiObject(name="Owner", description = "Owner of car.")
public @Data class Owner {
    @ApiObjectField(description = "Owner name and surname.")
    private String name;
}
