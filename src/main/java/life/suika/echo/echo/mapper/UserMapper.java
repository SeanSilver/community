package life.suika.echo.echo.mapper;

import life.suika.echo.echo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Suika on 2020/1/9.
 */
@Mapper
public interface UserMapper {

    @Insert("insert into User (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
