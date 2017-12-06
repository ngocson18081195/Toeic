package toeic.App.Utils;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by chien on 29/11/2017.
 */
@Component
@Getter
public class ServiceFiles {

    private String homeUser;
    private Character separate;

    @PostConstruct()
    public void init() throws Exception {
        this.homeUser = System.getProperty("user.home");
        String osName = System.getProperty("os.name");
        if (osName.toUpperCase().equals(OS.LINUX.toString())) {
            this.separate = '/';
        } else if (osName.toLowerCase().equals(OS.WINDOW.toString())) {
            this.separate = '\\';
        } else {
            throw new Exception("Os Now Allow");
        }
    }

    public byte[] getByteFromPath(String path) throws IOException {
        byte[] bytes = new byte[0];
        if (path != null) {
            bytes = Files.readAllBytes(new File(this.homeUser + this.separate + path).toPath());
        }
        return bytes;
    }

}
