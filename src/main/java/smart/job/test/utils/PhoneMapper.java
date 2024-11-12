package smart.job.test.utils;

import smart.job.test.model.dto.Phone;
import smart.job.test.model.entity.PhoneEntity;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneMapper {
    public static List<PhoneEntity> ToPhoneEntityList(List<Phone> phones) {
        return phones.
                stream().map(PhoneMapper::toPhoneEntity)
                .collect(Collectors.toUnmodifiableList());

    }

    private static PhoneEntity toPhoneEntity(Phone phone) {
        var phoneEntity = new PhoneEntity();
        phoneEntity.setCityCode(phone.getCityCode());
        phoneEntity.setCountryCode(phone.getCountryCode());
        phoneEntity.setNumber(phone.getNumber());
        return phoneEntity;

    }
}
