package cn.com.jonpad.spikecore.core.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户
 * @author Jon Chan
 * @date 2020/3/31 23:27
 */
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * UUID
   * 唯一约束
   */
  @Column(unique = true, length = 36)
  @NonNull
  private String uuid;

  @Column(unique = true, length = 36)
  @NonNull
  private String phone;

}
