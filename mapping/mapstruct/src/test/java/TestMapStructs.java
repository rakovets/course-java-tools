import by.rakovets.course.java.tools.mapping.mapstruct.entity.CarEntity;
import by.rakovets.course.java.tools.mapping.mapstruct.dto.CarDto;
import by.rakovets.course.java.tools.mapping.mapstruct.mapper.CarMapper;
import by.rakovets.course.java.tools.mapping.mapstruct.model.CarType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMapStructs {
    @Test
    public void shouldMapCarEntityToCatDto() {
        // GIVEN
        CarEntity carEntity = new CarEntity("Morris", 5, CarType.SEDAN);

        // WHEN
        CarDto carDto = CarMapper.INSTANCE.carEntityToCarDto(carEntity);

        // THEN
        Assertions.assertNotNull(carDto);
        Assertions.assertEquals("Morris", carDto.getMake());
        Assertions.assertEquals(5, carDto.getSeatCount());
        Assertions.assertEquals("SEDAN", carDto.getType());
    }

    @Test
    public void shouldMapCatDtoToCarEntity() {
        // GIVEN
        CarDto carDto = new CarDto("Morris", 5, "SEDAN");

        // WHEN
        CarEntity carEntity = CarMapper.INSTANCE.carDtoToCarEntity(carDto);

        // THEN
        Assertions.assertNotNull(carDto);
        Assertions.assertEquals("Morris", carEntity.getMake());
        Assertions.assertEquals(5, carEntity.getNumberOfSeats());
        Assertions.assertEquals(CarType.SEDAN, carEntity.getType());
    }
}
