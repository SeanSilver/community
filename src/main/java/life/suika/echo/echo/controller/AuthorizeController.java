package life.suika.echo.echo.controller;

import life.suika.echo.echo.dto.AccessTokenDTO;
import life.suika.echo.echo.dto.GithubUser;
import life.suika.echo.echo.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Suika on 2020/1/8.
 */
@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("85c9ebe7067f8a105f38");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_secret("3ede1ef9af9624a638336f38453d7b152ac54214");
        accessTokenDTO.setState(state);
        accessTokenDTO.setRedirect_id("http://localhost:8888/callback");
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());
        return "index";
    }
}





