package com.sarobidy.sum.file;

import com.sarobidy.sum.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
