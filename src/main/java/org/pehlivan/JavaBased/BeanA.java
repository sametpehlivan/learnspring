package org.pehlivan.JavaBased;

import org.pehlivan.JavaBased.LikeThirdParty.GreetingRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanA
{
    private GreetingRenderer renderer;
    private BeanB beanB;
    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
    @Autowired
    @Qualifier("standardRenderer")
    public void setRenderer(GreetingRenderer renderer) {
        this.renderer = renderer;
    }
    public BeanB getBeanB() {
        return beanB;
    }
    public GreetingRenderer getRenderer() {
        return renderer;
    }
}
