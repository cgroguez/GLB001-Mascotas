/*
DashBoard
 */
package puppet;

import java.util.ArrayList;
import java.util.List;


public class DashBoard {
   
    private List <Puppet> mascotas;
    private List <Post> publicacion;
    private List <User> usuarios;
    private UserManager userManager;
    private PostManager postManager;
    private PuppetManager puppetManager;

    public DashBoard(UserManager userManager, PostManager postManager, PuppetManager puppetManager) {
        this.mascotas =new ArrayList();
        this.publicacion = new ArrayList();
        this.usuarios = new ArrayList();
        this.userManager = userManager;
        this.postManager = postManager;
        this.puppetManager = puppetManager;
    }

    public List<Puppet> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Puppet> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Post> getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(List<Post> publicacion) {
        this.publicacion = publicacion;
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public PostManager getPostManager() {
        return postManager;
    }

    public void setPostManager(PostManager postManager) {
        this.postManager = postManager;
    }

    public PuppetManager getPuppetManager() {
        return puppetManager;
    }

    public void setPuppetManager(PuppetManager puppetManager) {
        this.puppetManager = puppetManager;
    }
    
    
    
    
}
