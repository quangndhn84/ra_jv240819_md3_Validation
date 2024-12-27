package ra.com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "App_User")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "user_name", columnDefinition = "varchar(50)", nullable = false, unique = true)
    @NotBlank(message = "Không được để trống tên đăng nhập")
    private String username;
    @Column(name = "user_password", columnDefinition = "varchar(100)", nullable = false)
    @NotBlank(message = "Không được để trống mật khẩu")
    @Size(min = 6, max = 10, message = "Mật khẩu phải có từ 6-10 ký tự")
    private String password;
    @Column(name = "user_fullname", columnDefinition = "varchar(100)", nullable = false)
    @NotEmpty(message = "Không được để trống họ và tên")
    private String fullname;
    @Column(name = "user_email", columnDefinition = "varchar(100)", nullable = false, unique = true)
    @NotBlank(message = "Không được để trống email")
    @Email(message = "Không đúng định dạng email")
    private String email;
    @Column(name = "user_phone", columnDefinition = "varchar(15)", nullable = false)
    @Pattern(regexp = "(091|092|098|035)+\\d{7}", message = "Không đúng định dạng số điện thoại VN")
    private String phone;
    @Column(name = "user_address", columnDefinition = "text")
    @NotBlank(message = "Không đuợc để trống địa chỉ")
    private String address;
    @Column(name = "user_bod")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bod;
    @Column(name = "user_status")
    private boolean status;
}
