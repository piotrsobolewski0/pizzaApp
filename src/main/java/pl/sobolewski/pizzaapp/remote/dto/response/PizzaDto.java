package pl.sobolewski.pizzaapp.remote.dto.response;

import java.util.List;

public class PizzaDto {
    private Integer is;
    private String name;
    private List<SizeDto> sizes;

    public PizzaDto() {
    }

    public PizzaDto(Integer is, String name, List<SizeDto> sizes) {
        this.is = is;
        this.name = name;
        this.sizes = sizes;
    }

    public Integer getIs() {
        return is;
    }

    public void setIs(Integer is) {
        this.is = is;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDto> getSizes() {
        return sizes;
    }

    public void setSizes(List<SizeDto> sizes) {
        this.sizes = sizes;
    }
}
