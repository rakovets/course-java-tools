package by.rakovets.course.java.tools.mapping.mapstruct.mapper;


import by.rakovets.course.java.tools.mapping.mapstruct.dto.CarDto;
import by.rakovets.course.java.tools.mapping.mapstruct.entity.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "seatCount", source = "numberOfSeats")
    CarDto carEntityToCarDto(CarEntity carEntity);

    @Mapping(target = "numberOfSeats", source = "seatCount")
    CarEntity carDtoToCarEntity(CarDto carEntity);
}


