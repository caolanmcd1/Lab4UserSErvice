package ie.atu.lab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController
{
    private RegistrationServiceClient registrationServiceClient;


    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient)
    {
        this.registrationServiceClient = registrationServiceClient;
    }

     @PostMapping("/confirm-and-register")
    public Map<String,String> confirmAndRegister(@RequestBody UserDetails userDetails)
    {
        String confrim = registrationServiceClient.someDetails((userDetails));
        Map<String,String> responseMessage = new HashMap<>();
        responseMessage.put("Message",confrim);
        return  responseMessage;
    }
}
