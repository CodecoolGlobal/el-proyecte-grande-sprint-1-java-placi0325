const ProductTable = ( { products } ) => {

    return (
        <div className="ProductTable">
          <table>
            <thead>
              <tr>
                <th>Products</th>
              </tr>
            </thead>
            <tbody>
              {products.map((product) => (
                <tr key={product.id}>
                  <td>{product.name}</td>
                  <td>{product.description}</td>
                  <td>{product.userId}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
        )
    
}

export default ProductTable;