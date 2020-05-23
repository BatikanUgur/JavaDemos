public interface IEntitiyRepository<T extends IEntitiy > {
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
