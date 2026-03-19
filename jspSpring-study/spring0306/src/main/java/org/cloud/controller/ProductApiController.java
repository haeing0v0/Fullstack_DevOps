package org.cloud.controller;

import java.util.List;

import org.cloud.dto.ProductDTO;
import org.cloud.service.ProductService;
import org.cloud.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/product")
public class ProductApiController {

	private final ProductServiceImpl productServiceImpl;

	@Autowired
	private ProductService productService;

	ProductApiController(ProductServiceImpl productServiceImpl) {
		this.productServiceImpl = productServiceImpl;
	}

	// 전체 조회
	@GetMapping
	public List<ProductDTO> productList() throws Exception {
		return productService.productList();
	}

	// 등록
	@PostMapping("/write")
	public ResponseEntity<String> insertProduct(@RequestBody ProductDTO product) throws Exception {

		try {
			productService.insertProduct(product);
			return ResponseEntity.ok("success");
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("Fail: " + e.getMessage());
		}
	}

	// 상세 조회
	@GetMapping("/{num}")
	public ProductDTO productDetail(@PathVariable("num") int num) throws Exception {

		return productService.productDetail(num);
	}

	// 수정
	@PostMapping("/{num}")
	public ResponseEntity<String> updateProduct(@PathVariable("num") int num, @RequestBody ProductDTO product)
			throws Exception {

		product.setNum(num);
		productService.updateProduct(product);

		return ResponseEntity.ok("success");
	}

	// 삭제
	@DeleteMapping("/{num}")
	public ResponseEntity<String> deleteProduct(@PathVariable("num") int num) throws Exception {

		productService.deleteProduct(num);

		return ResponseEntity.ok("success");
	}
}