package pojos.rest;

import lombok.Data;

/**
 * Created by samyy on 21-Sep-17.
 */
@Data
public class StudentAddress {
    private String streetName;
    private String houseNumber;
    private int postalCode;
    private String city;
    private String country;
}
