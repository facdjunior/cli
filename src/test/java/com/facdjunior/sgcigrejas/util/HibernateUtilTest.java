package com.facdjunior.sgcigrejas.util;

import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco
 */
public class HibernateUtilTest {

    @Test
    @Ignore
    public void conectar() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.close();
        HibernateUtil.getSessionFactory().close();
    }

}
