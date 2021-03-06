package de.th.koeln.ungewoehnlichesverhalten.anlaufstellenservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.util.regex.Pattern;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
public class Postleitzahl {

    private String mPlz;

    public Postleitzahl(String plz){

        if(!isValid(plz)){
            throw new IllegalArgumentException("Invalid zip code");
        }

        mPlz = plz;
    }

    private boolean isValid(String plz){
        Pattern pattern = Pattern.compile("[0-9]{5}", Pattern.CASE_INSENSITIVE);

        if (plz == null){
            return false;
        }
        else {
            return pattern.matcher(plz).find();
        }
    }
}
