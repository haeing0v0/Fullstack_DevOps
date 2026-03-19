package org.cloud.service;

import java.util.List;

import org.cloud.dto.ProductDTO;
import org.cloud.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<ProductDTO> productList() throws Exception {
		return productMapper.productList();
	}
	
	@Override
	public int insertProduct(ProductDTO product) throws Exception {
		productMapper.insertProduct(product);
		return 0;
	}
	
	@Override
	public ProductDTO productDetail(int num) throws Exception {
		ProductDTO product = productMapper.productDetail(num);
		return product;
	}
	
	@Override
	public int updateProduct(ProductDTO product) throws Exception {
		productMapper.updateProduct(product);
		return 0;
	}
	
	@Override
	public int deleteProduct(int num) throws Exception {
		productMapper.deleteProduct(num);
		return 0;
	}
}
