
package com.master.roleup.object;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.multipart.MultipartFile;

@XmlRootElement
public class Game implements Serializable{
    private Integer id;
    private String vtitle;
    private MultipartFile vimage;

    public Integer getId() {
        return id;
    }

    public MultipartFile getVimage() {
        return vimage;
    }

    public void setVimage(MultipartFile vimage) {
        
        this.vimage = vimage;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVtitle() {
        return vtitle;
    }

    public void setVtitle(String vtitle) {
        this.vtitle = vtitle;
    }


    
}
