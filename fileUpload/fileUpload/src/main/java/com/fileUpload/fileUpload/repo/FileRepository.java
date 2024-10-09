package com.fileUpload.fileUpload.repo;


import com.fileUpload.fileUpload.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}

