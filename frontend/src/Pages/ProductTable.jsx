import ProductLayoutInList from "../Components/ProductLayoutInList";

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
                 <td>
                 <ProductLayoutInList product={product} />
                  </td> 
                </tr>
              ))}
            </tbody>
          </table>
        </div>
        )
}

export default ProductTable;