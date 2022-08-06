package com.example.jpahipernate.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ColorConverter implements AttributeConverter<Color, String > {

    @Override
    public String convertToDatabaseColumn(Color attribute) {
        if (attribute == null) return null;
        else return attribute.getValue();

    }

    @Override
    public Color convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        if (dbData.equals("red")){
            return Color.RED;
        } else  {
            return Color.WHITE;
        }
    }

}
