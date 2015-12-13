package com.apress.prospring4.ch4

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader
import org.springframework.context.support.GenericApplicationContext

def ctx = new GenericApplicationContext();
def reader = new GroovyBeanDefinitionReader(ctx);

reader.beans {
    contact(Contact, firstName: 'Charis', lastName: 'Schaefer', age: 32)
}

ctx.refresh();
println ctx.getBean("contact")