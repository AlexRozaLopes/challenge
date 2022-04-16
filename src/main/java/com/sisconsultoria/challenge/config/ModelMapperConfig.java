package com.sisconsultoria.challenge.config;

import com.sisconsultoria.challenge.model.StudentsModel;
import com.sisconsultoria.challenge.utils.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.createTypeMap(StudentsModel.class, StudentDto.class)
                .<String>addMapping(src -> src.getHouseModel().getHouseName(), (dest, value) -> dest.setHouse(value));

        return modelMapper;
    }
}
