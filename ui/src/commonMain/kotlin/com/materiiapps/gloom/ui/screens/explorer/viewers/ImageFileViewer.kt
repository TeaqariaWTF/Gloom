package com.materiiapps.gloom.ui.screens.explorer.viewers

import androidx.compose.runtime.Composable
import com.materiiapps.gloom.gql.fragment.RepoFile

@Composable
expect fun ImageFileViewer(imageFile: RepoFile.OnImageFileType)