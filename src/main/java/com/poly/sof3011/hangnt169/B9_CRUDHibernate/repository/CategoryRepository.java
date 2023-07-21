package com.poly.sof3011.hangnt169.B9_CRUDHibernate.repository;

import com.poly.sof3011.hangnt169.B9_CRUDHibernate.entity.Category;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt
 */
public class CategoryRepository {

    // CRUD <=> CREATE, READ , UPDATE, DELETE
    // <=> INSERT INTO, SELECT, UPDATE, DELETE

    // GET ALL => SELECT => READ
    //HQL => Thuc The entity
    public List<Category> getAll() {
        List<Category> lists = new ArrayList<>();
        // code
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // C1: Query => jakarta
            Query query = session.createQuery(" FROM Category", Category.class);
            lists = query.getResultList();
            // C2: Query => Hibernate
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    public Category getOne(Long id) {
        Category category = null;
        // CODE
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // C1: Query => jakarta
            Query query = session.createQuery(" FROM Category WHERE id = :id", Category.class);
            query.setParameter("id", id);
            category = (Category) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }

    // UPDATE => UPDATE => BOOLEAN
    public Boolean update(Category category) {
        Transaction transaction = null;
        // code
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // Mo tran
            transaction = session.beginTransaction();
            // UPDATE / Sua 1 doi tuong vao DB: saveOrUpdate, merge
            session.merge(category);
            // commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // DELETE => delete => BOOLEAN
    public Boolean delete(Category category) {
        Transaction transaction = null;
        // code
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // Mo tran
            transaction = session.beginTransaction();
            // xoa / xoa 1 doi tuong vao DB: delete
            session.delete(category);
            // commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // ADD => INSERT INTO => BOOLEAN
    public Boolean add(Category category) {
        Transaction transaction = null;
        // code
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            // Mo tran
            transaction = session.beginTransaction();
            // Them / Add 1 doi tuong vao DB: save, saveOrUpdate, presist
            session.persist(category);
            // commit
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new CategoryRepository().getAll());
    }
}
