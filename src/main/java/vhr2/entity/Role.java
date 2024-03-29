package vhr2.entity;

import java.io.Serializable;

/**
 * Created by ycm on 2017/12/28.
 */
public class Role implements Serializable {

	private static final long serialVersionUID = -7631128643427925479L;
	
	private Long id;
    private String name;
    private String nameZh;

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

