package br.com.esig.service;

import br.com.esig.dao.TodoDao;
import br.com.esig.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

    @Override
    public void salvar(Todo todo) {
        todoDao.salvar(todo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Todo> recuperar() {
        return todoDao.recuperar() ;
    }

    @Override
    @Transactional(readOnly = true)
    public Todo recuperarPorId(Integer id) {
        return todoDao.recuperarPorId(id);
    }

    @Override
    public void atualizar(Todo todo) {
        todoDao.atualizar(todo);
    }

    @Override
    public void excluir(Integer id) {
        todoDao.excluir(id);

    }
}