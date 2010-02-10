package bitronix.tm.resource.jdbc;

/**
 * Eviction listener interface for {@link LruStatementCache}.
 * <p>&copy; <a href="http://www.bitronix.be">Bitronix Software</a></p>
 *
 * @author lorban
 */
public interface LruEvictionListener {

    public void onEviction(Object value);

}