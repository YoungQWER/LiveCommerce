package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.zerock.domain.UserVO;

@Mapper
public interface UserMapper {

    void registerUser(UserVO user);

    UserVO getUser(@Param("userId") int userId);

    void updateUser(UserVO user);

    void deleteUser(@Param("userId") int userId);

    boolean loginUser(@Param("username") String username, @Param("password") String password);

    List<UserVO> getUserList();
    
    UserVO selectUserByUserName(@Param("username") String username);

	void updateUserEnabledByUsername(@Param("username") String username, @Param("enabled") int enabled);

    // 사용자 이름으로 사용자의 ID를 가져오는 메서드
    int getUserIDByUsername(String username);
}