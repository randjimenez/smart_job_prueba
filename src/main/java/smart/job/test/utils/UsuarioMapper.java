package smart.job.test.utils;

import smart.job.test.model.dto.UserRequest;
import smart.job.test.model.dto.UserResponse;
import smart.job.test.model.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.UUID;

public class UsuarioMapper {

    public static UserResponse toDtoResponse(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }
        return UserResponse.builder()
                .id(userEntity.getId())
                .created(userEntity.getCreated())
                .modified(userEntity.getModified())
                .lastLogin(userEntity.getLastLogin())
                .token(userEntity.getToken())
                .isEnabled(userEntity.getIsEnabled())
                .build();
    }

    public static UserEntity toEntity(UserRequest userRequest) {
        if (userRequest == null) {
            return null;
        }
        var date = LocalDateTime.now();

        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setPassword(userRequest.getPassword());
        userEntity.setCreated(date);
        userEntity.setModified(date);
        userEntity.setLastLogin(date);
        userEntity.setToken(UUID.randomUUID());
        userEntity.setIsEnabled(true);

        return userEntity;
    }
}
