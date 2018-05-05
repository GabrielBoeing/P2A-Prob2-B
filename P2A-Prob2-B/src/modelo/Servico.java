package modelo;

import observer.Observer;

/**
 *
 * @author Luan Gomes
 */
public class Servico implements Observer{
    
    @Override
    public void update() {
        System.out.println(this.getClass().toString());
    }
    
}
