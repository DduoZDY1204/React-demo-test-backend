package work.dduo.access_backend.model.dto;

import lombok.Data;
import java.io.Serializable;

/**
 * 用户删除请求
 *
 */
@Data
public class UserDeleteRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户电话
     */
    private String mobile;

    /**
     * 用户性别
     */
    private String gender;

    /**
     * 用户状态
     */
    private String status;

    /**
     * 更新时间
     */
    private String date_string;

    private static final long serialVersionUID = 1L; // 用于序列化

}