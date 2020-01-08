package life.suika.echo.echo.dto;

/**
 * Created by Suika on 2020/1/8.
 */
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_id;
    private String state;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_id() {
        return redirect_id;
    }

    public void setRedirect_id(String redirect_id) {
        this.redirect_id = redirect_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
