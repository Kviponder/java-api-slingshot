package com.campusedu.devexercise;


import com.campusedu.devexercise.model.Course_Info;
import com.campusedu.devexercise.repository.CourseInfoRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


@Service
public class CSVParse {

    private final CourseInfoRepository courseInfoRepository;

}
